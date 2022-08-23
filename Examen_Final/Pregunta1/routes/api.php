<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

use App\Models\Cliente;
use App\Http\Controllers\ClienteController;

use App\Models\Cuenta;
use App\Http\Controllers\CuentaController;

use App\Models\User;
use App\Http\Controllers\UserController;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

Route::get('users', [UserController::class, 'index']);
Route::get('users/{id}', [UserController::class, 'show']);
Route::post('users', [UserController::class, 'store']);
Route::put('users/{id}', [UserController::class, 'update']);
Route::patch('users/{id}', [UserController::class, 'update']);
Route::delete('users/{id}', [UserController::class, 'destroy']);


Route::get('clientes', [ClienteController::class, 'index']);
Route::get('clientes/{id}', [ClienteController::class, 'show']);
Route::post('clientes', [ClienteController::class, 'store']);
Route::put('clientes/{id}', [ClienteController::class, 'update']);
Route::patch('clientes/{id}', [ClienteController::class, 'update']);
Route::delete('clientes/{id}', [ClienteController::class, 'destroy']);

Route::get('cuentas', [CuentaController::class, 'index']);
Route::get('cuentas/{id}', [CuentaController::class, 'show']);
Route::post('cuentas', [CuentaController::class, 'store']);
Route::put('cuentas/{id}', [CuentaController::class, 'update']);
Route::patch('cuentas/{id}', [CuentaController::class, 'update']);
Route::delete('cuentas/{id}', [CuentaController::class, 'destroy']);
       





