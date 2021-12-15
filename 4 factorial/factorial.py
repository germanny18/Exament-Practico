
from django.http import HttpResponse
import math

def factorial(request, num):
	fac = math.factorial(num)
	res = "<h1> factorial de %d</h1>" %num
	res = res + "<h1> es: %d</h1>" %fac
	return HttpResponse(res)


