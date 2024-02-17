function init() {
	include("INumberVec.java");
	include("AbstractNumberVec2.java");
	include("AbstractNumberVec3.java");
	include("AbstractNumberVec4.java");
	include("Vec2n.java");
	include("Vec3n.java");
	include("Vec4n.java");
	
	generate("number", [ "int", "float", "long", "double" ]);
}

function loop() {
	var number = get("number");
	
	var c = [
		"long_name",
		"short_name",
		"convert_x",
		"convert_y",
		"convert_z",
		"convert_w"
	];
	
	if (number == "int") {
		define(c[0], "Int");
		define(c[1], "i");
		define(c[2], "+ getX()");
		define(c[3], "+ getY()");
		define(c[4], "+ getZ()");
		define(c[5], "+ getW()");
	} else if (number == "float") {
		define(c[0], "Float");
		define(c[1], "f");
		define(c[2], "+ Float.floatToIntBits(getX())");
		define(c[3], "+ Float.floatToIntBits(getY())");
		define(c[4], "+ Float.floatToIntBits(getZ())");
		define(c[5], "+ Float.floatToIntBits(getW())");
	} else if (number == "long") {
		define(c[0], "Long");
		define(c[1], "l");
		define(c[2], "+ getX()");
		define(c[3], "+ getY()");
		define(c[4], "+ getZ()");
		define(c[5], "+ getW()");
	} else if (number == "double") {
		define(c[0], "Double");
		define(c[1], "d");
		define(c[2], "+ Double.doubleToLongBits(getX())");
		define(c[3], "+ Double.doubleToLongBits(getY())");
		define(c[4], "+ Double.doubleToLongBits(getZ())");
		define(c[5], "+ Double.doubleToLongBits(getW())");
	}
	
	replace("fluff.math.template", `fluff.math.gen._${number}`);
	replace("INumberVec", `I${get(c[0])}Vec`);
	replace("AbstractNumberVec2", `Abstract${get(c[0])}Vec2`);
	replace("AbstractNumberVec3", `Abstract${get(c[0])}Vec3`);
	replace("AbstractNumberVec4", `Abstract${get(c[0])}Vec4`);
	replace("Vec2n", `Vec2${get(c[1])}`);
	replace("Vec3n", `Vec3${get(c[1])}`);
	replace("Vec4n", `Vec4${get(c[1])}`);
	
	destination(`gen/_${number}/vec`);
}