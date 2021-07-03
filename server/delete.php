<?php
$conn = new mysqli('localhost', 'root', '', 'tsoulos');
$am=$_GET['am'];

$sql='DELETE FROM tsoulos WHERE AM='.$am;
echo $sql;
if ($conn->query($sql) === TRUE) {
    echo "data deleted";
}
else 
{
    echo "Error deleting record: " . $conn->error;
}
?>