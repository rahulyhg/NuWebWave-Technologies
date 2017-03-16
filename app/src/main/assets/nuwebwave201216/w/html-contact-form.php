<?PHP 
if(isset($_POST['g-recaptcha-response'])){
          $captcha=$_POST['g-recaptcha-response'];
     
        $secretKey = "6LdVVA8UAAAAABDKpMtw4w0N1fmKB9T27ZV-1Cg1";
        $ip = $_SERVER['REMOTE_ADDR'];
        $response=file_get_contents("https://www.google.com/recaptcha/api/siteverify?secret=".$secretKey."&response=".$captcha."&remoteip=".$ip);
        $responseKeys = json_decode($response,true);
        if(intval($responseKeys["success"]) !== 1) {
          echo '<h2>You are spammer ! Get the @$%K out</h2>';
        } else {
			
$message = '<html><body>';
$message .= '<center><table rules="all" style="border:0px solid #666;" border="0" cellpadding="3" cellspacing="3" width="600px" class="new_test">';
$message .= "<tr style='background: #eee;'><td colspan='2'><a href='http://www.nuwebwave.com/' target='_blank'>
<img src='http://nuwebwave.com/img/logo.png' ></a>
<a href='http://nuwebwave.com/' target='_blank' style='text-decoration:none;'><strong><center>www.nuwebwave.com</center></strong> </a></td></tr>";
$message .= "<tr><td colspan='2' align='center'>&nbsp;</td></tr>";	
$message .= "<tr><td colspan='2' style='text-decoration:none;'>Product Enquiry Details - www.nuwebwave.com</td></tr>";	
$message .= "<tr><td colspan='2'>&nbsp;</td></tr>";			
$message .= "<tr><td width='20%'><strong>Name</strong> </td><td width='80%'>".strip_tags($_POST['fname'])."</td></tr>";
$message .= "<tr><td  width='20%'><strong>Email ID </strong> </td><td width='80%'>".strip_tags($_POST['email'])."</td></tr>";
$message .= "<tr><td  width='20%'><strong>Mobile No</strong> </td><td width='80%'>".strip_tags($_POST['mobile'])."</td></tr>";
$message .= "<tr><td  width='20%'><strong>Message</strong> </td><td width='80%'>".strip_tags($_POST['message'])."</td></tr>";

$message .= "</table></center>";
$message .= "</body></html>";

$EmailTo = "nuwebwave@gmail.com";
$ser= "ceo@nuwebwave.com";
$headers = "".strip_tags($_POST['email'])."\r\n";
$headers .= "Reply-To: ". strip_tags($_POST['email']) . "\r\n";
$headers .= "Bcc: ". $ser. "\r\n";
$headers .= "MIME-Version: 1.0\r\n";
$headers .= "Content-Type: text/html; charset=ISO-8859-1\r\n";
$Subject = "Enquiry Details - www.nuwebwave.com";
// send email 
 $success = mail($EmailTo, $Subject, $message, "From: $headers") or die(" not send");
if($success){ echo "<script>window.location='thanks.html'</script>";}
         
		}
		}
		if(!$captcha){
          echo '<h2>Please check the the captcha form.</h2>';
          exit;
        }
		?>