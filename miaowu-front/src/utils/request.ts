import axios from 'axios'
import {ElMessage} from "element-plus"

const service = axios.create({
	baseURL: import.meta.env.VITE_BASE_URL,
	timeout: 5000
})

// 拦截请求
service.interceptors.request.use(
	config => {
		return config
	},
	error => {
		return Promise.reject(error)
	}
)

// 拦截回复
service.interceptors.response.use(
	response => {
		console.log(response)

		const code = response.data.code || 200 // 0||200的结果是200，所以后端用0表示成功也是可以的

		if (code === 200) {
			return response
		} else {
			ElMessage.error(response.data.msg)
			return Promise.reject(new Error(response.data.msg))
		}
	},
	error => {
		ElMessage.error(error.toString())
		return Promise.reject(error)
	}
)

export default service
