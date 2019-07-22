import Vue from 'vue'
import Router from 'vue-router'
import Layout from '@/views/layout/Layout'
import Guide from "@/views/guide";
import Fina from '@/views/fina'
import Action from '@/views/action'
import Calculate from '@/views/calculate'
import Funddb from '@/views/funddb'

Vue.use(Router)

export default new Router({
  routes: [{
    path: '/guide',
    component: Layout,
    redirect: '/guide/index',
    children: [{
      path: 'index',
      name: '引导页',
      component: Guide
    }]
  }, {
    path: '/fina',
    component: Layout,
    redirect: '/fina/index',
    children: [{
        path: 'index',
        name: 'fina',
        component: Fina
      },
      {
        path: 'index?src=:src',
        name: 'fina_tab页',
        component: Fina
      }
    ]
  }, {
    path: '/action',
    component: Layout,
    redirect: '/action/index',
    children: [{
        path: 'index',
        name: 'action',
        component: Action
      },
      {
        path: 'index?src=:src',
        name: 'action_tab页',
        component: Action
      }
    ]
  }, {
    path: '/calculate',
    component: Layout,
    redirect: '/calculate/index',
    children: [{
        path: 'index',
        name: 'calculate',
        component: Calculate
      },
      {
        path: 'index?src=:src',
        name: 'calculate_tab页',
        component: Calculate
      }
    ]
  }, {
    path: '/funddb',
    component: Layout,
    redirect: '/funddb/index',
    children: [{
        path: 'index',
        name: 'funddb',
        component: Funddb
      },
      {
        path: 'index?src=:src',
        name: 'funddb_tab页',
        component: Funddb
      }
    ]
  }, {
    path: '*',
    redirect: '/guide'
  }, ]
})
