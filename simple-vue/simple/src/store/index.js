import Vue from "vue";
import Vuex from "vuex";
import getters from './getters'
import Menu from "./modules/Menu";
import Tag from "./modules/Tag";


Vue.use(Vuex);

export default new Vuex.Store({
    modules:{
        Menu,
        Tag
    },
    getters
});