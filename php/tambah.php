<?php
 
	if($_SERVER['REQUEST_METHOD']=='POST'){

		$nama = $_POST['nama'];
		$nik = $_POST['nik'];
		$status = $_POST['status'];
		$kota = $_POST['kota'];
		$lokasi = $_POST['lokasi'];
		$health = $_POST['health'];
		$hadir = $_POST['hadir'];

		//Pembuatan Syntax SQL
		$sql = "INSERT INTO absen (nama,nik,status,kota,lokasi,health,hadir)
		 VALUES ('$nama','$nik','$status','$kota','$lokasi','$health','$health')";
		
		//Import File Koneksi database
		require_once('DbConnect.php');
		
		//Eksekusi Query database
		if(mysqli_query($conn,$sql)){
			echo 'Success Add New Record';
		}else{
			echo 'SOrry, Failed';
		}
		
		mysqli_close($conn);
	}
?>
