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



    $('.product_slider').slick({
        slidesToShow: 5,
        centerMode: true,
        arrows: false,
        dots: true,
        autoplay: true,
        responsive: [
            {
              breakpoint: 768,
              settings: {
                slidesToShow: 1,
                centerMode: false,
                }
            },
        ]

    });


    $('.product_list .s_left').on('click', function () {
        $('.product_slider').slick('slickPrev');
    })

    $('.product_list .s_right').on('click', function () {
        $('.product_slider').slick('slickNext');
    })


    $('.tab_link>li').on('click', function () {
        var idx = $(this).index();
        $(this).addClass('on').siblings().removeClass('on')
        $('.tab_content>li').eq(idx).addClass('on').siblings().removeClass('on')
    })



    $('.footer #link').on('change', function () {
        var lik = $(this).val();
        if (lik) window.open(lik)
    })

    $('.mbtn').on('click',function () {
        $('nav').toggleClass('on');
        $(this).toggleClass('is-active')
    })




    //////////////////////////////////////////////////////////////////////////
});