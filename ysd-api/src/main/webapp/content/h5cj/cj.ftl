<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width,user-scalable=no">
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <meta name="x5-orientation" content="portrait">
    <meta name="x5-fullscreen" content="true">
    <meta name="screen-orientation" content="portrait">
    <meta name="full-screen" content="yes">
    <title>抽奖活动页面</title>
    <link rel="stylesheet" href="../../assets/h5cj/css/cj.css">
    <script>
        setSize();
        window.addEventListener("resize",setSize,false);
        window.addEventListener("orientationchange",setSize,false);
        function setSize() {
            var html = document.getElementsByTagName("html")[0];
            var width = html.getBoundingClientRect().width;
            html.style.fontSize = width/16 + 'px';
        }
    </script>
</head>
<body>
    <article class="wrap">
        <section class="dial-wrap">
            <div class="dial-lamp"></div>
            <div class="dial-disk" id="rotate"></div>
            <div class="dial-get">
                <a href="javascript:;" class="btn btned" id="pointer"></a>
            </div>
        </section>
        <section class="help-btns">
            <a href="cj_rule.ftl"></a><a href="javascript:;"></a>
        </section>
        <!--<section class="win-list">
            <ul class="list">
                <li><span class="name">张XX</span><span class="txt">抽中舒肤床上四件套一份</span><span class="time">01-20 15:30</span></li>
                <li><span class="name">张XX</span><span class="txt">抽中舒肤床上四件套一份</span><span class="time">01-20 15:30</span></li>
                <li><span class="name">张XX</span><span class="txt">抽中舒肤床上四件套一份</span><span class="time">01-20 15:30</span></li>
                <li><span class="name">张XX</span><span class="txt">抽中舒肤床上四件套一份</span><span class="time">01-20 15:30</span></li>
                <li><span class="name">张XX</span><span class="txt">抽中舒肤床上四件套一份</span><span class="time">01-20 15:30</span></li>
                <li><span class="name">张XX</span><span class="txt">抽中舒肤床上四件套一份</span><span class="time">01-20 15:30</span></li>
                <li><span class="name">张XX</span><span class="txt">抽中舒肤床上四件套一份</span><span class="time">01-20 15:30</span></li>
                <li><span class="name">张XX</span><span class="txt">抽中舒肤床上四件套一份</span><span class="time">01-20 15:30</span></li>
            </ul>
        </section>-->
        <section class="win-my" id="myWin">
            <div class="pic">
                <img src="img/my/8.png" alt="">
            </div>
            <h3 class="title">进口有机大米一袋</h3>
            <div class="hint"><span>温馨提示：</span><p>请您在中奖后3个工作日内保持手机畅通，以便客服专员通过电话与您确认中奖信息。</p></div>
        </section>
    </article>
    <!--<div class="layer">-->
        <!--<div class="shade"></div>-->
        <!--<div class="layer-main">-->
            <!--<div class="layer-section">-->
                <!--<div class="layer-wrap">-->
                    <!--<div class="layer-content">-->
                        <!--<div class="pop-exchange">-->
                            <!--<div class="input-box">-->
                                <!--<input type="text" id="exchangeText" placeholder="请输入抽奖码"/>-->
                            <!--</div>-->
                            <!--<div class="btn-box"><a href="javascript:;" class="btn"></a></div>-->
                        <!--</div>-->
                    <!--</div>-->
                <!--</div>-->
            <!--</div>-->
        <!--</div>-->
    <!--</div>-->
<script src="../../assets/h5cj/js/jquery.min.js"></script>
<script src="../../assets/h5cj/js/jQueryRotate.js"></script>
<script src="../../assets/h5cj/js/cj.js"></script>
</body>
</html>