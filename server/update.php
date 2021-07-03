<?php
$conn = new mysqli('localhost', 'root', '1234', 'tsoulos');
$am=$_POST['am'];
$fname=$_POST['fname'];
$lname=$_POST['lname'];
$mathima=$_POST['mathima'];
$description=$_POST['description'];

$sql='UPDATE `tsoulos` SET `lessons`="'.$mathima.'",`fname`="'.$fname.'",`lname`="'.$lname.'",`description`="'.$description.'" WHERE `AM`='.$am;
if ($conn->query($sql) === TRUE) {
    echo "data updated";
}
else 
{
    echo "Error updating record: " . $conn->error;
}
?>