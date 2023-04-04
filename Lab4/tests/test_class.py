import pytest

from src.mypkg.Triangle import Triangls, Triangle


class Test():
    flag = -1
    def setup_class(self):
        Test.flag = 0
        print("begin to test Triangle")

    def teardown_class(self):
        print("finished to test Triangle")

    def test_classify(self):
        print("test Triangle.classify")
        assert Triangle.classify(1, 1, 1) == Triangls.EQUILATERAL
        assert Triangle.classify(0, 0, 0) == Triangls.INVALID
        assert Triangle.classify(1, -1, 1) == Triangls.INVALID
        assert Triangle.classify(-1, 0, 1) == Triangls.INVALID
        assert Triangle.classify(1, 2, 2) == Triangls.ISOSCELES
        assert Triangle.classify(3, 3, 2) == Triangls.ISOSCELES
        assert Triangle.classify(4, 5, 4) == Triangls.ISOSCELES
        assert Triangle.classify(1000, 2, 999) == Triangls.SCALENE

    def test_calculateArea(self):
        print("test Triangle.calculateArea")
        assert Triangle.calculateArea(0, 0, 0) == 0.0
        assert Triangle.calculateArea(-1, 0, 1) == 0.0
        assert Triangle.calculateArea(1, 1, 1) == 0.4330127018922193
        assert Triangle.calculateArea(1e9, 1e9, 1e9) == 4.330127018922193e+17
        assert Triangle.calculateArea(3, 4, 5) == 6.0
        assert Triangle.calculateArea(1e9, 1, 1e9) == 500000000.0
        assert Triangle.calculateArea(2, 1e9, 999999999) == 866025403.3514259

    @pytest.mark.skip(reason="try pytest.mark.skip")
    def test_skip(self):
        print("if this was printed , that means something went wrong when using pytest.mark.skip")

    @pytest.mark.skipif(1 > 1, reason="try pytest.mark.skipif")
    def test_skipif(self):
        print("if this was printed , that means the condition of skipif is False")
