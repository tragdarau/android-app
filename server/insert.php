<?php
$conn = new mysqli('localhost', 'root', '', 'tsoulos');

$fname=$_GET['fname'];
$lname=$_GET['lname'];
$mathima=$_GET['mathima'];
$description='description';

$sql='INSERT INTO  tsoulos (lessons,fname,lname,description)  VALUES("'.$mathima.'","'.$fname.'","'.$lname.'","'.$description.'")'; 
echo $sql;
if ($conn->query($sql) === TRUE) {
    echo "data updated";
}
else 
{
    echo "Error updating record: " . $conn->error;
}
?>