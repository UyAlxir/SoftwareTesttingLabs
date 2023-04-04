import math
from enum import Enum


class Triangls(Enum):
    EQUILATERAL = 1
    ISOSCELES = 2
    SCALENE = 3
    INVALID = 4


class Triangle():
    @staticmethod
    def classify(a, b, c):
        """
        given threee sides of a triangle, classify it to SCALENE,EQUILATERAL,ISOSCELES,INVALID
        :param a: side a
        :param b: side b
        :param c: side c
        :return: SCALENE or EQUILATERAL or ISOSCELES or INVALID
        """
        if a <= 0 or b <= 0 or c <= 0:
            return Triangls.INVALID
        elif a + b <= c or a + c <= b or b + c <= a:
            return Triangls.INVALID
        elif a == b and b == c :
            return Triangls.EQUILATERAL
        elif a == b or b == c or a == c:
            return Triangls.ISOSCELES
        else:
            return Triangls.SCALENE

    @staticmethod
    def calculateArea(a, b, c):
        """
        given threee sides of a triangle, calculate the area
        :param a: side a
        :param b: side b
        :param c: side c
        :return: the area of the Triangle
        """
        ans = 0.0
        if Triangle.classify(a, b, c) == Triangls.INVALID:
            return ans
        else:
            s = (a+b+c+0.0)/2
            ans = math.sqrt(s*(s-a)*(s-b)*(s-c))
        return ans


if __name__ == "__main__":
    print(Triangle.calculateArea(1, 1, 1))
    print(Triangle.calculateArea(1e9, 1e9, 1e9))
    print(Triangle.calculateArea(3, 4, 5))
    print(Triangle.calculateArea(1e9, 1, 1e9))
    print(Triangle.calculateArea(2, 1e9, 999999999))
