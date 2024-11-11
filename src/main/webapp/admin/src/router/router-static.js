import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/shijuanliebiao/exam'
    import news from '@/views/modules/news/list'
    import kefuguanli from '@/views/modules/kefuguanli/list'
    import shangpinxinxi from '@/views/modules/shangpinxinxi/list'
    import yifahuodingdan from '@/views/modules/yifahuodingdan/list'
    import peisongxinxi from '@/views/modules/peisongxinxi/list'
    import yiwanchengdingdan from '@/views/modules/yiwanchengdingdan/list'
    import storeup from '@/views/modules/storeup/list'
    import rukuxinxi from '@/views/modules/rukuxinxi/list'
    import forum from '@/views/modules/forum/list'
    import weizhifudingdan from '@/views/modules/weizhifudingdan/list'
    import yiquxiaodingdan from '@/views/modules/yiquxiaodingdan/list'
    import yizhifudingdan from '@/views/modules/yizhifudingdan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import messages from '@/views/modules/messages/list'
    import yituikuandingdan from '@/views/modules/yituikuandingdan/list'
    import shangpinleibie from '@/views/modules/shangpinleibie/list'
    import rizhixinxi from '@/views/modules/rizhixinxi/list'
    import mingxingtongkuan from '@/views/modules/mingxingtongkuan/list'
    import config from '@/views/modules/config/list'
    import chukuxinxi from '@/views/modules/chukuxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
        path: '/news',
        name: '新闻资讯',
        component: news
      }
          ,{
        path: '/kefuguanli',
        name: '客服管理',
        component: kefuguanli
      }
          ,{
        path: '/shangpinxinxi',
        name: '商品信息',
        component: shangpinxinxi
      }
          ,{
        path: '/yifahuodingdan',
        name: '已发货订单',
        component: yifahuodingdan
      }
          ,{
        path: '/peisongxinxi',
        name: '配送信息',
        component: peisongxinxi
      }
          ,{
        path: '/yiwanchengdingdan',
        name: '已完成订单',
        component: yiwanchengdingdan
      }
          ,{
        path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
        path: '/rukuxinxi',
        name: '入库信息',
        component: rukuxinxi
      }
          ,{
        path: '/forum',
        name: '论坛管理',
        component: forum
      }
          ,{
        path: '/weizhifudingdan',
        name: '未支付订单',
        component: weizhifudingdan
      }
          ,{
        path: '/yiquxiaodingdan',
        name: '已取消订单',
        component: yiquxiaodingdan
      }
          ,{
        path: '/yizhifudingdan',
        name: '已支付订单',
        component: yizhifudingdan
      }
          ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
        path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
        path: '/yituikuandingdan',
        name: '已退款订单',
        component: yituikuandingdan
      }
          ,{
        path: '/shangpinleibie',
        name: '商品类别',
        component: shangpinleibie
      }
          ,{
        path: '/rizhixinxi',
        name: '日志信息',
        component: rizhixinxi
      }
          ,{
        path: '/mingxingtongkuan',
        name: '明星同款',
        component: mingxingtongkuan
      }
          ,{
        path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
        path: '/chukuxinxi',
        name: '出库信息',
        component: chukuxinxi
      }
        ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
