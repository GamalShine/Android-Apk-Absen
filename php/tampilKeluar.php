<?php 

include 'DbConnect.php';

$query = mysqli_query($conn, "SELECT * FROM absenKeluar");
$json = array();


while($row = mysqli_fetch_assoc($query)){
    $json[] = $row;
}

echo json_encode(array(
    'hasil' => $json
));

mysqli_close($conn);

?>