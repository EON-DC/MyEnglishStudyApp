import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import CreateView from '../views/CreateView.vue'
import EditViuw from '../views/EditView.vue'
import LookUpView from '../views/LookUpView.vue'
import QuizView from '../views/QuizView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/create',
    name: 'create',
    component: CreateView
  },
  {
    path: '/edit',
    name: 'edit',
    component: EditViuw
  },
  {
    path: '/lookup',
    name: 'lookup',
    component: LookUpView
  },
  {
    path: '/quiz',
    name: 'quiz',
    component: QuizView
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
