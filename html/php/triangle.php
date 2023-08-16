<?php
    for ($i=0; $i < 7; $i++) {
        for ($k=7; $k > $i; $k--) { 
            echo " ";
        }
        $a = $i*2;
        for ($k=0; $k <= $a; $k++) { 
            echo "*";
        }
        echo "\n";
        }
?>