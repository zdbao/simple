import { tag } from "@/mock/tag";
export const getTag = (menuId) => {
    return new Promise((resolve, reject) => {
        resolve({data:tag[menuId]})
    })
}