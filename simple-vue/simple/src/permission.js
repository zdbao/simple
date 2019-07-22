import router from './router'
import store from './store'
router.beforeEach((to, from, next) => {
    store.dispatch("Menu/getMenuByHref",to.path).then(data => {
        store.dispatch('Tag/getTag',data)
    })
    next()
})