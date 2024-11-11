// 初始化分页
function createPage(el) {
    var element = $(el)
    // 创建上一步按钮
    element.append('<a class="prev_btn page_common_btn_style"></a>')
    // 添加图标
    $(el + ' .prev_btn').append('<span class="fa fa-angle-left"></span>')
    // 创建页码按钮框
    element.append('<div class="page_btn_box"></div>')
    // 创建下一步按钮
    element.append('<a class="next_btn page_common_btn_style"></a>')
    // 添加图标
    $(el + ' .next_btn').append('<span class="fa fa-angle-right"></span>')
    // 返回 el
    return {
        el: el, //选择器
        html: $(el).html(), //htnl 内容
    }
}

// 设置分页
function setPage(dom, pageData) {
    var pageData=pageData;
    if(pageData==undefined){
        pageData={};
    }
    // el = dom 选择器  例如：'.class' /  '#id'
    // pageData = 分页配置

    if(pageData.maxBtnNum<5||pageData.maxBtnNum==undefined){
        pageData.maxBtnNum=5;
    }
    
    if(pageData.pageCurrent==undefined){
        pageData.pageCurrent=1;
    }

    if(pageData.pageSize==undefined){
        pageData.pageSize=10;
    }

    if(pageData.pageTotal==undefined){
        pageData.pageTotal=0;
    }

    // 初始化设置分页 (防止多次使用配置函数出现错误)
    $(dom.el).html(dom.html)


    // 获取需要多少个按钮
    var btnSum; // sum
    if (pageData.pageTotal < pageData.pageSize) {
        btnSum = 1;
    } else if (pageData.pageTotal % pageData.pageSize === 0) {
        btnSum = pageData.pageTotal / pageData.pageSize;
    } else {
        btnSum = parseInt(pageData.pageTotal / pageData.pageSize) + 1;
    }
    console.log('有', btnSum, '页');
    
    // 设置当前页
    var Current=pageData.pageCurrent; //当前页
    if(Current<=0){
        Current=1;
    }else if(Current>btnSum){
        Current=btnSum;
    }
    console.log('当前第',Current,'页') 

    // 生成分页按钮函数
    function createBtnItem(pageCurrent){
        var _len;
        if (pageData.maxBtnNum >= btnSum) {
            // 最大按钮数刚好等于  有多少页时  无需隐藏其他按钮
            _len=btnSum;
        } else {
            // 最大按钮数大于  有多少页时  需要隐藏其他按钮
            _len=pageData.maxBtnNum;
        }
        console.log('最多生成',_len,'个按钮')
        // 设置分页显示段
        var minPageNum,maxPageNum;
        minPageNum=pageCurrent-parseInt(_len/2);
        maxPageNum=pageCurrent+parseInt(_len/2);

        if(_len%2===0){
            maxPageNum--
        }

        if(minPageNum<1){ 
            maxPageNum+= 1-minPageNum;
            minPageNum=1;
        }

        if(maxPageNum>btnSum){
            minPageNum-=maxPageNum-btnSum;
            maxPageNum=btnSum;
        }

        console.log(minPageNum,maxPageNum)

        var html_S='',content_html='';

        // 生成按钮
        for(var i=minPageNum;i<maxPageNum+1;i++){
            if(i==pageCurrent){ 
                html_S='<span class="page_common_btn_style page_common_btn_active" data-pageIndex="'+i+'">'+i+'</span>';
            }else{ 
                html_S='<a class="page_common_btn_style" data-pageIndex="'+i+'">'+i+'</a>';
            }
            if(i==minPageNum&&minPageNum!=1){
                html_S='<span class="page_common_btn_style">···</span>'
            }
            if(i==maxPageNum&&maxPageNum!=btnSum){
                html_S='<span class="page_common_btn_style">···</span>'
            }
            content_html+=html_S;
        }
        $(dom.el+' .page_btn_box').html(content_html)
    } 
    createBtnItem(Current);
    // 
    setUpbtnState(dom.el,Current)

    // 分页切换按钮事件
    $(dom.el+' .page_btn_box').on('click','a.page_common_btn_style',function(){
        Current=parseInt($(this).attr('data-pageIndex'));
        pageData.change(Current)
        createBtnItem(Current);
        // 
        setUpbtnState(dom.el,Current)
    })

    // 上一页事件
    $(dom.el).on('click','a.prev_btn',function(){
        if(Current<=1){
            return;
        }
        Current-=1;
        pageData.change(Current)
        createBtnItem(Current);
        // 
        setUpbtnState(dom.el,Current)
    })

    // 回到首页事件
    $(dom.el).on('click','a.prev_top_btn',function(){
        if(Current<=1){
            return;
        }
        Current=1;
        pageData.change(Current)
        createBtnItem(Current);
        // 
        setUpbtnState(dom.el,Current)
    })

    // 下一页事件
    $(dom.el).on('click','a.next_btn',function(){
        if(Current>=btnSum){
            return;
        }
        Current+=1;
        pageData.change(Current)
        createBtnItem(Current);
        // 
        setUpbtnState(dom.el,Current)
    })

    // 跳至尾页事件
    // 回到首页事件
    $(dom.el).on('click','a.next_bottom_btn',function(){
        if(Current>=btnSum){
            return;
        }
        Current=btnSum;
        pageData.change(Current)
        createBtnItem(Current);
        // 
        setUpbtnState(dom.el,Current)
    })

    // 处理公共上一步下一步状态
    function setUpbtnState(dom_s,num){
        var css_s={
            'color':'#b2b2b2',
            'opacity':'0.6',
        }
        var none_css={
            'color':'#606266',
            'opacity':'1',
        }
        if(num<=1){
            setCssStyle(1,css_s)
            setCssStyle(2,none_css)
        }else if(num>=btnSum){
            setCssStyle(2,css_s)
            setCssStyle(1,none_css)
        }else{
            setCssStyle(1,none_css)
            setCssStyle(2,none_css)
        }
        
        // 
        function setCssStyle(type,_cssObject){
            if(type==1){
                // 上
                $(dom_s+' .prev_top_btn').css(_cssObject)
                $(dom_s+' .prev_btn').css(_cssObject)
            }else{
                // 下
                $(dom_s+' .next_btn').css(_cssObject)
                $(dom_s+' .next_bottom_btn').css(_cssObject)
            }
        }
    }
}