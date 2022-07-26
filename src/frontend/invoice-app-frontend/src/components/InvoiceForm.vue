<template>

  <div class="container">
    <div class="col-start-1_col-end-13">
      <h1 class="">New Invoice</h1>
      <p>Bill form</p>
    </div>
    <div class="col-start-1_col-end-13">
      <label class="street" for="streetAddress">Street address</label>
      <input class="street streetInput" type="text" id="streetAddress">
    </div>
    <div class="col-start-1_col-end-13">

      <label>City</label>
      <input type="text">

      <label>Post Code</label>
      <input type="text">

      <label>Country</label>
      <input type="text">

    </div>
    <label>Invoice Date</label>
    <input type="date">
    <label>Payment Terms</label>
    <select>
      <option>Net 30 days</option>
    </select>
    <label>Occupation</label>
    <input type="text">
    <h1>Item List</h1>
    <label>Item name</label>
    <input type="text">
    <label>Quantity</label>
    <input type="number">
    <label>Price</label>
    <input type="number">
    <span>Total: 150€</span>
  </div>

</template>

<script>

export default {

  name: "InvoiceForm",
  components: {

  },
  props: {
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
