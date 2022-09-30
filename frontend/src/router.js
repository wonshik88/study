
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import InventoryManager from "./components/listers/InventoryCards"
import InventoryDetail from "./components/listers/InventoryDetail"

import InboundManager from "./components/listers/InboundCards"
import InboundDetail from "./components/listers/InboundDetail"

import OutboundManager from "./components/listers/OutboundCards"
import OutboundDetail from "./components/listers/OutboundDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/inventories',
                name: 'InventoryManager',
                component: InventoryManager
            },
            {
                path: '/inventories/:id',
                name: 'InventoryDetail',
                component: InventoryDetail
            },

            {
                path: '/inbounds',
                name: 'InboundManager',
                component: InboundManager
            },
            {
                path: '/inbounds/:id',
                name: 'InboundDetail',
                component: InboundDetail
            },

            {
                path: '/outbounds',
                name: 'OutboundManager',
                component: OutboundManager
            },
            {
                path: '/outbounds/:id',
                name: 'OutboundDetail',
                component: OutboundDetail
            },



    ]
})
