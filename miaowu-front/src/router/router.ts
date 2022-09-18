import { createRouter, createWebHashHistory } from "vue-router";

import Index from "@/view/index.vue"

const routes = [
	{
		path: "/",
		name: "Index",
		component: Index
	},
	{
		path: "/Li",
		name: "IndexLi",
		component: Index
	},
	{
		path: "/Liu",
		name: "IndexLiu",
		component: Index
	}
]

const router = createRouter({
	history: createWebHashHistory(),
	routes
})

export default router
