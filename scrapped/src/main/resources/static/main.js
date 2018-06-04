'use strict';

angular.module('dbapp', ['ngRoute','dbapp.homectrl'])
        .config( function ($routeProvider) {
        $routeProvider
            .when('/home', {
                templateUrl: 'home/home-view.html',
                controller: 'homectrl'
            })
            .otherwise({redirectTo: '/home'});
    });