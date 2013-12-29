function success() {
	if (document.Inserat.start_inserat.value == "") {
		alert("Bitte Start eingeben!");
		document.Inserat.start_inserat.focus();
		return false;
	}
	if (document.Inserat.end_inserat.value == "") {
		alert("Bitte Ziel eingeben!");
		document.Inserat.end_inserat.focus();
		return false;
	} else {
		$('.hidden-inserat').css({
			'visibility' : 'hidden'
		});
		$('.hidden-success').css({
			'visibility' : 'visible'
		});
		setTimeout('',6000);
	}
}