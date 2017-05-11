<?php
   $json = $_POST['json'];

   /* sanity check */
   if (json_decode($json) != null)
   {
     $file = fopen('https://api.myjson.com/bins/1gr2p5','w+');
     fwrite($file, $json);
     fclose($file);
   }
?>
