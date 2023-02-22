<template>
  <div>
    <table class="table table-dark table-striped m-1">
      <thead>
        <tr>
          <th>meaning_id</th>
          <th>meaning</th>
          <th>word_id</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(item, index) in categories" :key="index">
          <td>{{ item.meaning_id }}</td>
          <td>{{ item.meaning }}</td>
          <td>{{ item.word_id }}</td>
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
          meaning_id: 1,
          meaning: 'look vs watch vs see',
          word_id: 'sdfzsfe'
        },
        { meaning_id: 2, meaning: 'coke vs pepsi', word_id: 'zcxzvd' }
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
