
from django.http import HttpResponse
import math


def coeBinomial(request, n,k):
	coebin = math.comb(n, k)
	res = "<h1> el coeficiente coeBinomial es: %d</h1>" %coebin
	return HttpResponse(res)
