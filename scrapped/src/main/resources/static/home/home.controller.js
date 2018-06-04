var app = angular.module('dbapp.homectrl',[])
    .controller('homectrl', function ($scope,$http) {
        $scope.welcomeMessage = "Hey there!";

        $scope.add = function(a){
            return a + a;
        }

        $scope.selectedConnector = "";

        $scope.availableConnectors = ['MySQL'];
});