function init() {
	include("INumberVector.java");
	include("AbstractNumberVec2.java");
	include("AbstractNumberVec3.java");
	include("Vec2n.java");
	include("Vec3n.java");
	
	generate("number", [ "int", "float", "long", "double" ]);
}

function loop() {
	var number = get("number");
	
	var c = [
		"long_name",
		"short_name",
		"convert_proj_1",
		"convert_proj_2",
		"convert_proj_3"
	];
	
	if (number == "int") {
		define(c[0], "Int");
		define(c[1], "i");
		define(c[2], "+ proj_1()");
		define(c[3], "+ proj_2()");
		define(c[4], "+ proj_3()");
	} else if (number == "float") {
		define(c[0], "Float");
		define(c[1], "f");
		define(c[2], "+ Float.floatToIntBits(proj_1())");
		define(c[3], "+ Float.floatToIntBits(proj_2())");
		define(c[4], "+ Float.floatToIntBits(proj_3())");
	} else if (number == "long") {
		define(c[0], "Long");
		define(c[1], "l");
		define(c[2], "+ proj_1()");
		define(c[3], "+ proj_2()");
		define(c[4], "+ proj_3()");
	} else if (number == "double") {
		define(c[0], "Double");
		define(c[1], "d");
		define(c[2], "+ Double.doubleToLongBits(proj_1())");
		define(c[3], "+ Double.doubleToLongBits(proj_2())");
		define(c[4], "+ Double.doubleToLongBits(proj_3())");
	}
	
	replace("fluff.vecmath.template", `fluff.vecmath.gen._${number}`);
	replace("INumberVector", `I${get(c[0])}Vector`);
	replace("AbstractNumberVec2", `Abstract${get(c[0])}Vec2`);
	replace("AbstractNumberVec3", `Abstract${get(c[0])}Vec3`);
	replace("Vec2n", `Vec2${get(c[1])}`);
	replace("Vec3n", `Vec3${get(c[1])}`);
	
	destination(`gen/_${number}/vector`);
}