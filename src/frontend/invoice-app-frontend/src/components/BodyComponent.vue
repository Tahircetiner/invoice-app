<template>
  <div class="content">
    <!--<div class="container">
      <h1 class="col-start-3_row-start-2">Rechnungen</h1>
      <p class="col-start-3_row-start-3 hint"> Keine Rechnungen</p>
      <h3 class="col-start-7_col-end-8_row-start-2">Filter by status</h3>
      <div class="button-primary col-start-9_col-end-10_row-start-2 buttonContainer">
        <div class="plusContainer">
          <svg width="11" height="11" xmlns="http://www.w3.org/2000/svg"><path d="M6.313 10.023v-3.71h3.71v-2.58h-3.71V.023h-2.58v3.71H.023v2.58h3.71v3.71z" fill="#7C5DFA" fill-rule="nonzero"/></svg>
        </div>
        <button style="margin: auto;" class="button-primary">New invoice</button>
      </div>

    </div>-->
    <!--<InvoiceItem/>-->
    <InvoiceForm/>
  </div>
</template>

<script>
//import InvoiceItem from "@/components/InvoiceItem";
import InvoiceForm from "@/components/InvoiceForm";
export default {

  name: "BodyComponent",
  components: {
    InvoiceForm
  },
  props: {

  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
