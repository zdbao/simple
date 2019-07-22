import Vue from "vue";
import Vuex from "vuex";
import getters from './getters'
import Menu from "./modules/Menu";
import Service from "./modules/Service";
import Data from "./modules/Data";
import TimeZone from "./modules/TimeZone";
import AppName from "./modules/AppName";

Vue.use(Vuex);

export default new Vuex.Store({
    modules:{
        Menu,
        Service,
        Data,
        TimeZone,
        AppName
    },
    getters
});