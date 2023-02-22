<template>
  <div>
    <table class="table table-dark table-striped m-1">
      <thead>
        <tr>
          <th>word_id</th>
          <th>word</th>
          <th>category_id</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(item, index) in categories" :key="index">
          <td>{{ item.word_id }}</td>
          <td>{{ item.word }}</td>
          <td>{{ item.category_id }}</td>
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
          word_id: 1,
          word: 'look vs watch vs see',
          category_id: 'sdfzsfe'
        },
        { word_id: 2, word: 'coke vs pepsi', category_id: 'zcxzvd' }
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
