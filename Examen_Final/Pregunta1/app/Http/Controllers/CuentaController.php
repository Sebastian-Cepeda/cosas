<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Cuenta;

class CuentaController extends Controller
{
     /**
    * Display a listing of the resource.
    *
    * @return \Illuminate\Http\Response
    */
   public function index()
   {
       return Cuenta::all();
   }

   /**
    * Show the form for creating a new resource.
    *
    * @return \Illuminate\Http\Response
    */
   public function create()
   {
       //
   }

   /**
    * Store a newly created resource in storage.
    *
    * @param  \Illuminate\Http\Request  $request
    * @return \Illuminate\Http\Response
    */
   public function store(Request $request)
   {
     
           return Cuenta::create($request->all());
    
   }

   /**
    * Display the specified resource.
    *
    * @param  \App\Models\Cuenta  $cliente
    * @return \Illuminate\Http\Response
    */
   public function show($id)
   {
       return Cuenta::find($id);
   }

   /**
    * Show the form for editing the specified resource.
    *
    * @param  \App\Models\Cuenta  $cliente
    * @return \Illuminate\Http\Response
    */
   public function edit(Cuenta $cliente)
   {
       //
   }

   /**
    * Update the specified resource in storage.
    *
    * @param  \Illuminate\Http\Request  $request
    * @param  \App\Models\Cuenta  $cliente
    * @return \Illuminate\Http\Response
    */
   public function update(Request $request, $id)
   {
           $cliente = Cuenta::findOrFail($id);
           $cliente->update($request->all());
           return $cliente;
   }

   /**
    * Remove the specified resource from storage.
    *
    * @param  \App\Models\Cuenta  $cliente
    * @return \Illuminate\Http\Response
    */
   public function destroy($id)
   {
      $cliente=Cuenta::findOrFail($id); 
        $cliente->delete();
      return $cliente ;
   
   }
}
