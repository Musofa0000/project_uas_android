package com.tofa.Villa_1412200037.ui

import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapFragment
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.tofa.Villa_1412200037.R
import com.tofa.Villa_1412200037.application.VillaApp
import com.tofa.Villa_1412200037.databinding.FragmentSecondBinding
import com.tofa.Villa_1412200037.model.Villa

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() , OnMapReadyCallback, GoogleMap.OnMarkerDragListener{

    private var _binding: FragmentSecondBinding? = null

    private val binding get() = _binding!!
    private lateinit var applicationContext: Context
    private val villaViewModel: VillaViewModel by viewModels {
        VillaViewModelFactory((applicationContext as VillaApp).repository)
    }
        private val args : SecondFragmentArgs by navArgs()
        private var villa : Villa? = null
        private lateinit var mMap : GoogleMap
        private var currentLatLang : LatLng? = null
        private lateinit var fusedLocationClient : FusedLocationProviderClient
    override fun onAttach(context: Context) {
        super.onAttach(context)
        applicationContext = requireContext().applicationContext
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        villa = args.villa
        if (villa != null ){
            binding.deleteButton.visibility =View.VISIBLE
            binding.savebutton.text= "Ubah"
            binding.nameEditText.setText(villa?.name)
            binding.addresEditText.setText(villa?.address)
            binding.capacityEditText.setText(villa?.capacity)

        }
        //binding google maps

        val MapFragment = childFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
         MapFragment.getMapAsync (this )
        checkPermission()

        val name = binding.nameEditText.text
        val address =  binding.addresEditText.text
        val capacity = binding.capacityEditText.text

        binding.savebutton.setOnClickListener {
            if(villa == null){
                val Villa = Villa(0, name.toString(), address.toString(), capacity.toString(),currentLatLang?.latitude,currentLatLang?.longitude)
                villaViewModel.insert(Villa)

            } else{
                val Villa = Villa(villa?.id!!, name.toString(), address.toString(), capacity.toString(),currentLatLang?.latitude,currentLatLang?.longitude)
                villaViewModel.update(Villa)

            }

            findNavController().popBackStack()// untuk dismiss halaman ini
        }
        binding.deleteButton.setOnClickListener{
            villa?.let {  villaViewModel.delete(it) }
            findNavController().popBackStack()// untuk dismiss halaman ini
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        // implemantasi drag marker
        mMap.setOnMarkerDragListener(this)

        val uiSettings=mMap.uiSettings
        uiSettings.isZoomControlsEnabled = true


        mMap.setOnMarkerDragListener(this)

    }

    override fun onMarkerDrag(p0: Marker) {

    }

    override fun onMarkerDragEnd(marker : Marker) {
        val newPosition = marker.position
        currentLatLang = LatLng(newPosition.latitude,newPosition.longitude)
        Toast.makeText(context,currentLatLang.toString(),Toast.LENGTH_SHORT).show()
    }

    override fun onMarkerDragStart(p0: Marker) {

    }
    private fun checkPermission(){
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(applicationContext)
        if (ContextCompat.checkSelfPermission(
            applicationContext,
            android.Manifest.permission.ACCESS_FINE_LOCATION
        )== PackageManager.PERMISSION_GRANTED
        ){
            getCurrentLocation()
        }else{
            Toast.makeText(applicationContext,"Akses Lokasi Ditolak ",Toast.LENGTH_SHORT).show()
        }




    }
    private fun getCurrentLocation(){
        if (ContextCompat.checkSelfPermission(
                applicationContext,
                android.Manifest.permission.ACCESS_FINE_LOCATION
            )!= PackageManager.PERMISSION_GRANTED
        ){
            return
        }
        // untuk test current location coba run di device langsung atau build apknya terus instal dihp masing - masing
            fusedLocationClient.lastLocation
                .addOnSuccessListener{ location ->
                    if (location != null){
                        var latLang = LatLng(location.latitude, location.longitude)
                        currentLatLang = latLang
                        var title = "Marker"
                        //menampilkan lokasi sesuai koordinat yg sudah disimpan atau di update tadi
                        if (villa!=null ){
                            title = villa?.name.toString()
                            val newCurrentLocation = LatLng(villa?.latitude!!,villa?.longitude!!)
                            latLang = newCurrentLocation
                        }
                        val MarkerOption = MarkerOptions()
                            .position(latLang)
                            .title (title)
                            .draggable(true)
                            .icon (BitmapDescriptorFactory.fromResource(R.drawable.ic_villa))
                        mMap.addMarker(MarkerOption)
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLang,15f ))

                    }

                }
    }
}