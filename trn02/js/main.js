$(function () {
    //////////////////////////////////////////////////////////////////////////


    $(".top_banner i").on('click', function () {
        $('.top_banner').slideUp();
    });


    $('.main_slider').on('init reInit afterChange', function () {
        let current = $('.slick-current');
        current.addClass('on').siblings().removeClass('on');
    });


    $('.main_slider').slick({
        arrows: false,
        dots: true,
        autoplay: true,
        pauseOnHover: false,
        pauseOnFocus: false,
    });

    $('.movie .dec i:nth-of-type(1)').on('click', function () {
        $('.movie video').trigger('pause');
    });

    $('.movie .dec i:nth-of-type(2)').on('click', function () {
        $('.movie video').trigger('play');
    });





    $('#myMovie').YTPlayer();

    $('.utube i:nth-of-type(1)').on('click', function () {
        $('#myMovie').YTPPause();
    });

    $('.utube i:nth-of-type(2)').on('click', function () {
        $('#myMovie').YTPPlay();
    });



    //////////////////////////////////////////////////////////////////////////
});