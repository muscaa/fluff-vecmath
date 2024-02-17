function init() {
	include("INumberSize.java");
	include("Size2n.java");
	include("Size3n.java");
	
	generate("number", [ "int", "float", "long", "double" ]);
}

function loop() {
	var number = get("number");
	
	var c = [
		"long_name",
		"short_name"
	];
	
	if (number == "int") {
		define(c[0], "Int");
		define(c[1], "i");
	} else if (number == "float") {
		define(c[0], "Float");
		define(c[1], "f");
	} else if (number == "long") {
		define(c[0], "Long");
		define(c[1], "l");
	} else if (number == "double") {
		define(c[0], "Double");
		define(c[1], "d");
	}
	
	replace("fluff.math.template", `fluff.math.gen._${number}`);
	replace("INumberSize", `I${get(c[0])}Size`);
	replace("AbstractNumberVec2", `Abstract${get(c[0])}Vec2`);
	replace("AbstractNumberVec3", `Abstract${get(c[0])}Vec3`);
	replace("Size2n", `Size2${get(c[1])}`);
	replace("Size3n", `Size3${get(c[1])}`);
	
	destination(`gen/_${number}/size`);
}