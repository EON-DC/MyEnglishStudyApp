<template>
  <div>
    <table class="table table-dark table-striped m-1">
      <thead>
        <tr>
          <th>category_id</th>
          <th>category</th>
          <th>link</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(item, index) in categories" :key="index">
          <td>{{ item.category_id }}</td>
          <td>{{ item.category }}</td>
          <td>{{ item.link }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>
<script>
export default {
  name: '',
  components: {},
  props: {},
  data() {
    return {
      categories: [
        {
          category_id: 1,
          category: 'look vs watch vs see',
          link: 'sdfzsfe'
        },
        { category_id: 2, category: 'coke vs pepsi', link: 'zcxzvd' }
      ]
    }
  },
  setup() {},
  created() {},
  mounted() {},
  unmounted() {},
  methods: {}
}
</script>
