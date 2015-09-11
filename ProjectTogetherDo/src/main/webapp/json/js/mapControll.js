  $(document).ready(function(){ 
    $('.incheon').on('click', function(){
      var mapControll = $('.mapControll *');
      mapControll.remove();
      
      $('#kMap').fadeOut(300, function() {
        $('#kMap').attr('src','images/test.png')
        $('#kMap').animate({width:150,height:200});
        $('#scroll').animate({width:850,height:650,paddingLeft:50});
        $('.koreaMap').animate({width:150,height:200});
        $('#kMap').fadeIn(300);
      });
      
    });
    
    $('.detailGo').on('click',function(){
      location.replace('../json/detail.html');
    });
});