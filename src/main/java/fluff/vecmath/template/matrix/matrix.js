function init() {
	include("INumberMatrix.java");
	include("AbstractNumberMatrix.java");
	include("Mat33n.java");
	
	generate("number", [ "int", "float", "long", "double" ]);
}

function loop() {
	var number = get("number");
	
	var c = [
		"long_name",
		"short_name",
		"convert_ij"
	];
	
	if (number == "int") {
		define(c[0], "Int");
		define(c[1], "i");
		define(c[2], "+ get(i, j)");
	} else if (number == "float") {
		define(c[0], "Float");
		define(c[1], "f");
		define(c[2], "+ Float.floatToIntBits(get(i, j))");
	} else if (number == "long") {
		define(c[0], "Long");
		define(c[1], "l");
		define(c[2], "+ get(i, j)");
	} else if (number == "double") {
		define(c[0], "Double");
		define(c[1], "d");
		define(c[2], "+ Double.doubleToLongBits(get(i, j))");
	}
	
	replace("fluff.vecmath.template", `fluff.vecmath.gen._${number}`);
	replace("INumberMatrix", `I${get(c[0])}Matrix`);
	replace("AbstractNumberMatrix", `Abstract${get(c[0])}Matrix`);
	replace("Mat33n", `Mat33${get(c[1])}`);
	
	destination(`gen/_${number}/matrix`);
}