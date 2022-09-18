import { createApp } from 'vue'
import '@/style.css'
import App from '@/App.vue'

// element-plus
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
// element-plus icon
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
// element-plus 中文
import zhCn from 'element-plus/lib/locale/lang/zh-cn'

// pinia
import { createPinia } from 'pinia'

import router from '@/router/router'

const app = createApp(App)
// element-plus icon
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
  app.component(key, component)
}
app
  .use(ElementPlus, {locale: zhCn})
  .use(router)
  .use(createPinia())
  .mount('#app');
