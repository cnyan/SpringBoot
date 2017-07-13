<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SSE DEMO</title>
</head>


<script type="text/javascript" src="../asserts/js/jquery.js"></script>



<body>


    <div id="msgFromSsePush" >



     <script type="text/javascript">

        //    if (!!window.EventSource) { //1 EventSource 新式浏览器支持，是SSE 的客户端
        //        var source = new EventSource('push');
        //        s='';
        //        source.addEventListener('message', function(e) {//2
        //            s+=e.data+"<br/>";
        //            $("#msgFromSsePush").html(s);
        //
        //        });
        //
        //        source.addEventListener('open', function(e) {
        //            console.log("连接打开.");
        //        }, false);
        //
        //        source.addEventListener('error', function(e) {
        //            if (e.readyState == EventSource.CLOSED) {
        //                console.log("连接关闭");
        //            } else {
        //                console.log(e.readyState);
        //            }
        //        }, false);
        //    } else {
        //        console.log("你的浏览器不支持SSE");
        //    }


        function onLoadSSE() {

            if (!!window.EventSource) {

                console.log("Event source available");
                var source = new EventSource('/push');


                source.onmessage=function(event)
                {
                    document.getElementById("msgFromSsePush").innerHTML+=event.data + "<br />";
                };


            }

        }

        onLoadSSE();
    </script>

    </div>
</body>
</html>