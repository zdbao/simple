import {treeMenu,timeZone,appNames} from '@/mock/common';
export const getTreeMenu = () => {
    return new Promise((resolve, reject) => {
        resolve({data:treeMenu})
    })
}
export const getTimeZone = () => {
    return new Promise((resolve,reject) => {
        resolve({data:timeZone})
    })
}
export const getAppNames = () => {
    return new Promise((resolve,reject) => {
        resolve({data:appNames})
    })
}