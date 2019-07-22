
import { treeMenu } from "@/mock/menu";
export const getTreeMenu = () => {
    return new Promise((resolve, reject) => {
        resolve({data:treeMenu})
    })
}