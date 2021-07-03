<?php

echo "results ";

$AM = $_GET['AM'];

$conn = new mysqli("localhost", "root", "", "tsoulos");
$result = $conn->query("SELECT * FROM tsoulos WHERE AM=".$AM);

if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
        echo "id: " . $row["AM"]. " - Name: " . $row["fname"]. "    SURNAME " . $row["lname"]. "<br>";
    }
} else {
    echo "0 results";
}
$conn->close();
?>