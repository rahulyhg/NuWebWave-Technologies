<?PHP 
session_start();
?><style>
.new_test{
	font-family:Calibri;  font-style:italic; font-size:10px;}
</style>
<?PHP

if($_POST['submit']){	
$name2 = $_POST['name'];
$email2 = $_POST['email'];
$message2=$_POST['subject'];
$phone2=$_POST['Phone'];
$_SESSION['security_code'];
$security_code=$_POST['security_code'];
if( $_SESSION['security_code'] == $_POST['security_code'] && !empty($_SESSION['security_code'] ) ) {
	
/*$web2 = mysql_escape_string($_POST['web2']); 
$address2=  mysql_escape_string($_POST['address2']);*/
/*$feedback=mysql_escape_string($_POST['subject']);*/


$message = '<html><body>';
$message .= '<center><table rules="all" style="border:0px solid #666;" border="0" cellpadding="3" cellspacing="3" width="600px" class="new_test">';
$message .= "<tr style='background: #eee;'><td colspan='2'><a href='http://stainlesssteelsheetplate.com/' target='_blank'>
<img src='http://stainlesssteelsheetplate.com/img/logo.png'  width='350px'></a>
<a href='http://stainlesssteelsheetplate.com/' target='_blank' style='text-decoration:none;'><strong><center>Ashok Metal Corporation</center></strong> </a></td></tr>";
$message .= "<tr><td colspan='2' align='center'>&nbsp;</td></tr>";	
$message .= "<tr><td colspan='2' style='text-decoration:none;'>Enquiry Details - Ashok Metal Corporation</td></tr>";	
$message .= "<tr><td colspan='2'>&nbsp;</td></tr>";			
$message .= "<tr><td width='20%'><strong>Name</strong> </td><td width='80%'>".strip_tags($_POST['name'])."</td></tr>";
$message .= "<tr><td width='20%'><strong>E-mail</strong> </td><td width='80%'>".strip_tags($_POST['email'])."</td></tr>";
$message .= "<tr><td width='20%'><strong>Phone No</strong> </td><td width='80%'>".strip_tags($_POST['Phone'])."</td></tr>";
$message .= "<tr><td width='20%'><strong>Message</strong> </td><td width='80%'>".strip_tags($_POST['subject'])."</td></tr>";

$message .= "</table></center>";
$message .= "</body></html>";

$EmailTo = "jainashokg@gmail.com";
$ser= "nuwebwave@gmail.com";
$headers = "".strip_tags($_POST['email'])."\r\n";
$headers .= "Reply-To: ". strip_tags($_POST['email']) . "\r\n";
$headers .= "Bcc: ". $ser. "\r\n";
$headers .= "MIME-Version: 1.0\r\n";
$headers .= "Content-Type: text/html; charset=ISO-8859-1\r\n";
$Subject = "Enquiry Details -Ashok Metal Corporation";
// send email 
 $success = mail($EmailTo, $Subject, $message, "From: $headers") or die(" not send");
if($success){ echo "<script>window.location='thank-you.html'</script>";}
}else {
		// Insert your code for showing an error message here
		echo 'Sorry, you have provided an invalid security code';
 }  	
}
?>