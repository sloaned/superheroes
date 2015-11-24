
$(document).ready(function(){
	
	loadTable();
});

function loadTable(){
	$.ajax({
		url: '/hero',
		method: 'GET'
	}).then(function(heroes){
		$("tbody").children().remove();
		for(var i = 0; i < heroes.length; i++)
		{
			addDataToRow(heroes[i]);
		}
	});
};

function addDataToRow(hero){
	var powers = "";
	for(var i = 0; i < hero.powers.length-1; i++)
	{
		powers += hero.powers[i].power;
		powers += ", ";
	}
	powers += hero.powers[hero.powers.length-1].power;
	
	var feet = parseInt(hero.height/12);
	var inches = parseInt(hero.height)%12;
	var height = feet + "' " + inches + "\"";
	var row = "<tr><td>" + hero.heroName + "</td><td>" + hero.realName + "</td><td>" + hero.origin +
		"</td><td><img src='" + hero.costume + "'/></td><td>" + height + "</td><td>" + hero.weight + "</td><td>" + powers + "</td></tr>";
	$("#heroTable tbody").append(row);
};