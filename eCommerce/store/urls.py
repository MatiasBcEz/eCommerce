from django.urls import path
from . import views

urlpatterns = [
    path('', views.store, name="store"),
    #path('store/', views.store, name="store"),
]
