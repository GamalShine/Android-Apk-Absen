<?php 

include 'DbConnect.php';
$id = $_GET['id'];


$query = mysqli_query($conn, "SELECT * FROM absenKeluar WHERE id=$id");
$json = array();

$row = mysqli_fetch_array($query);
	array_push($json,array(
			"id"=>$row['id'],
			"nama"=>$row['nama'],
			"nik"=>$row['nik'],
			"status"=>$row['status'],
			"kota"=>$row['kota'],
			"lokasi"=>$row['lokasi'],
			"health"=>$row['health'],
			"hadir"=>$row['hadir']
		));
	echo json_encode(array(
		'hasil' => $json
	));

mysqli_close($conn);

?>
