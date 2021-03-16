import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        },
	'test_sumOfDivBy3Or5 - {
	    assert(Exercises.sumOfDivBy3Or5(11, 20) == 65)
            assert(Exercises.sumOfDivBy3Or5(0, 4) == 3)
            assert(Exercises.sumOfDivBy3Or5(6, 37) == 321)
	},
        'test_primeFactor - {
	    assert(Exercises.primeFactor(30) == Seq(2, 3, 5))
            assert(Exercises.primeFactor(100) == Seq(2, 5))
            assert(Exercises.primeFactor(1) == Seq(1))
            assert(Exercises.primeFactor(3) == Seq(3))
	},
        'test_sumByFunc - {
	    assert(Exercises.sumScalars(Vector2D(2, 3), Vector2D(4, 5), Vector2D(6, 7), Vector2D(8, 9)) == 134.0)
            assert(Exercises.sumScalars(Vector2D(1, 2), Vector2D(3, 0), Vector2D(3, 2), Vector2D(9, 3)) == 36.0)
            assert(Exercises.sumScalars(Vector2D(2, 33), Vector2D(4, 5), Vector2D(2, 4), Vector2D(3, 4)) == 195.0)
            assert(Exercises.sumCosines(Vector2D(1, 0), Vector2D(0, 1), Vector2D(0, 1), Vector2D(1, 0)) == 0.0)
	},
        'test_sortByHeavyweight - {
	    assert(Exercises.sortByHeavyweight() == Seq("Lithium", "Sodium", "Potassium", "Calcium", "Cesium", "Magnesium",
    "Aluminum", "Graphite", "Silver", "Tin", "Zirconium", "Chrome", "Nickel", "Iron", "Copper",
    "Titanium", "Cobalt", "Lead", "Platinum", "Uranium", "Gold", "Tungsten", "Plutonium"))
            assert(Exercises.sortByHeavyweight(Map("A" -> (4, 2), "B" -> (3, 1.5))) == Seq("B", "A"))
            assert(Exercises.sortByHeavyweight(Map()) == Seq())
	}
    }
}