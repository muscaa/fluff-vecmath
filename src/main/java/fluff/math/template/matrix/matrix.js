function init() {
	include("INumberMatrix.java");
	include("AbstractNumberMatrix2.java");
	include("AbstractNumberMatrix3.java");
	include("Mat2n.java");
	include("Mat3n.java");
	
	generate("number", [ "int", "float", "long", "double" ]);
}

function loop() {
	var number = get("number");
	
	var c = [
		"long_name",
		"short_name",
		"convert_ij",
		"convert_ijk"
	];
	
	if (number == "int") {
		define(c[0], "Int");
		define(c[1], "i");
		define(c[2], "+ get(i, j)");
		define(c[3], "+ get(i, j, k)");
	} else if (number == "float") {
		define(c[0], "Float");
		define(c[1], "f");
		define(c[2], "+ Float.floatToIntBits(get(i, j))");
		define(c[3], "+ Float.floatToIntBits(get(i, j, k))");
	} else if (number == "long") {
		define(c[0], "Long");
		define(c[1], "l");
		define(c[2], "+ get(i, j)");
		define(c[3], "+ get(i, j, k)");
	} else if (number == "double") {
		define(c[0], "Double");
		define(c[1], "d");
		define(c[2], "+ Double.doubleToLongBits(get(i, j))");
		define(c[3], "+ Double.doubleToLongBits(get(i, j, k))");
	}
	
	replace("fluff.math.template", `fluff.math.gen._${number}`);
	replace("INumberMatrix", `I${get(c[0])}Matrix`);
	replace("AbstractNumberMatrix2", `Abstract${get(c[0])}Matrix2`);
	replace("AbstractNumberMatrix3", `Abstract${get(c[0])}Matrix3`);
	replace("Mat2n", `Mat2${get(c[1])}`);
	replace("Mat3n", `Mat3${get(c[1])}`);
	
	destination(`gen/_${number}/matrix`);
}