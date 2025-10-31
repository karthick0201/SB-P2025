<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Love Result</title>
    <style>
        body {
            text-align: center;
            font-family: 'Segoe UI', sans-serif;
            background-color: #fff0f5;
        }

        .result-box {
            margin-top: 80px;
            font-size: 28px;
            animation: pulse 1s infinite;
        }

        @keyframes pulse {
            0% { transform: scale(1); color: #ff1493; }
            50% { transform: scale(1.2); color: #ff69b4; }
            100% { transform: scale(1); color: #ff1493; }
        }

        .emoji {
            font-size: 60px;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="result-box">
        💖 Love Result 💖<br><br>
        <strong>${history.yourName}</strong> ❤️ <strong>${history.crushName}</strong><br><br>
        <div class="emoji">${history.relationType}</div>
        <br>
        Compatibility Score: <strong>${history.result}%</strong>
    </div>

	<br>
	<div>
	<a href="love-calcultor"> GO - Love Calculator</a>
	<br>
	<a href="logout-session">Logout</a>
	
	</div>


</body>
</html>